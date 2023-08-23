package code.pcc.apitest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import code.pcc.apitest.model.ApiModel;
import code.pcc.apitest.service.ApiService;


@RestController
@RequestMapping("service")
public class AppController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/findAll")
    public Object findAll() {
        return apiService.findAll();
    }

    
    @PostMapping("/gentoken")
    public ResponseEntity<ApiResponse> gentoken(@RequestBody ApiModel apiModel) {
        ApiResponse response = new ApiResponse();
        if (apiModel.getSsoType() == null ||
                apiModel.getSystemId() == null ||
                apiModel.getSystemName() == null ||
                apiModel.getSystemTransactions() == null ||
                apiModel.getSystemPrivileges() == null ||
                apiModel.getSystemUserGroup() == null ||
                apiModel.getSystemLocationGroup() == null ||
                apiModel.getUserId() == null ||
                apiModel.getUserFullName() == null ||
                apiModel.getUserRdOfficeCode() == null ||
                apiModel.getUserOfficeCode() == null ||
                apiModel.getClientLocation() == null ||
                apiModel.getLocationMachineNumber() == null ||
                apiModel.getTokenId() == null){
            // Return a 400 Bad Request response
            response.setResponseCode("E000001");
            response.setResponseMessage("ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้ เนื่องจากไม่พบข้อมูลการ Post");
            // Set ResponseData here
            ApiResponse.ResponseData responseData = new ApiResponse.ResponseData();
            responseData.setUserId(apiModel.getUserId());
            responseData.setTokenId(apiModel.getTokenId());

            // Set the responseData in the ApiResponse
            response.setResponseData(responseData);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }

        try {
            // Attempt to insert data into the database
            apiService.insert(apiModel);

            // If the insertion is successful, update the response accordingly
            response.setResponseCode("I07000");
            response.setResponseMessage("ทำรายการเรียบร้อย");
            // Set ResponseData here
            ApiResponse.ResponseData responseData = new ApiResponse.ResponseData();
            responseData.setUserId(apiModel.getUserId());
            responseData.setTokenId(apiModel.getTokenId());
            // Set the responseData in the ApiResponse
            response.setResponseData(responseData);
            return ResponseEntity.ok(response);

        } catch (Exception e) {
            // Handle exceptions (including database connection issues)
            response.setResponseCode("E000001");
            response.setResponseMessage("ไม่สามารถบันทึกข้อมูลงฐานข้อมูลได้ เนื่องจากไม่พบฐานข้อมูล");
            // Set ResponseData here
            ApiResponse.ResponseData responseData = new ApiResponse.ResponseData();
            responseData.setUserId(apiModel.getUserId());
            responseData.setTokenId(apiModel.getTokenId());
            // Set the responseData in the ApiResponse
            response.setResponseData(responseData);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
    

    public static class ApiResponse {
        private String responseCode;
        private String responseMessage;
        private ResponseData responseData;

        public String getResponseCode() {
            return responseCode;
        }

        public void setResponseCode(String responseCode) {
            this.responseCode = responseCode;
        }

        public String getResponseMessage() {
            return responseMessage;
        }

        public void setResponseMessage(String responseMessage) {
            this.responseMessage = responseMessage;
        }

        public ResponseData getResponseData() {
            return responseData;
        }

        public void setResponseData(ResponseData responseData) {
            this.responseData = responseData;
        }

        public static class ResponseData {
            private String userId;
            private String tokenId;

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public String getTokenId() {
                return tokenId;
            }

            public void setTokenId(String tokenId) {
                this.tokenId = tokenId;
            }
        }
    }

}
