### ทำการติดตั้ง <br>
 - Spring Boot Framework Version 2.6.10 <br>   
 - JAVA JDK Version 17 <br> 
 - PostgreSQl Version 14.9.1 <br>  
 - DBeaver <br>

### ไฟล์ pom.xml
เชื่อมกับ Swagger ใช้ Maven Repository
 - SpringDoc OpenAPI UI Version 1.6.5 <br> 
 - Swagger Annotations Version 1.5.20 <br>

### การทดสอบ
ใช้โปรแกรม DBeaver เข้าถึงฐานข้อมูล 
แถบบนเลือก Database > New Datebase Connection
จะโชว์หน้าต่าง Connect to a database เลือก PostgreSQl แล้วใส่ข้อมูลตามนี้
Host : localhost 
Port : 5432 
Database : ssotest 
Username : ssodev
Password : sso2022ok

เข้าเว็บไซต์ URL : http://localhost:8080/apitest/swagger-ui/index.html 

เลือก /service/gentoken กด try it out ใส่ Request body <br>
ตัวอย่าง Request

    {
	    "ssoType": "SSOData",
	    "systemId": "VATDEDEV",
		"systemName": "ระบบบันทึกข้อมูลภาษีมูลค่าเพิ่มทดสอบ",
		"systemTransactions": "PRIV-010,PRIV-020,PRIV-040,PRIV-050",
		"systemPrivileges": "0|0|0|0",
		"systemUserGroup": "GRP-010,GRP-020,GRP-040",
		"systemLocationGroup": "CliC001",
		"userId": "WS233999",
		"userFullName": "ประสาท จันทร์อังคาร ",
		"userRdOfficeCode": "01000999",
		"userOfficeCode": "01001139",
		"clientLocation": "01001139",
		"locationMachineNumber": "CLI00000718-9999",
		"tokenId": "eyJzdWIiOiIxMjM0IiwiYXVkIjpbImFkbWluIl0sImlzcyI6Im1hc29uLm1ldGFtdWcubmV0IiwiZXhwIjoxNTc0NTEyNzY1LCJpYXQiOjE1NjY3MzY3NjUsImp0aSI6ImY3YmZlMzNmLTdiZjctNGViNC04ZTU5LTk5MTc5OWI1ZWI4YSJ9"
	}

กดเลือก execute 
ถ้าสำเร็จ 200 OK จะได้ผลลัพธ์ Responses body เป็นดังนี้

    {
	    "responseCode": "I07000",
	    "responseMessage": "ทำรายการเรียบร้อย", 
	    "responseData": {
		     "userId": "WS233999", 
		     "tokenId": "eyJzdWIiOiIxMjM0IiwiYXVkIjpbImFkbWluIl0sImlzcyI6Im1hc29uLm1ldGFtdWcubmV0IiwiZXhwIjoxNTc0NTEyNzY1LCJpYXQiOjE1NjY3MzY3NjUsImp0aSI6ImY3YmZlMzNmLTdiZjctNGViNC04ZTU5LTk5MTc5OWI1ZWI4YSJ9"
	    }
    }
ตรวจสอบฐานข้อมูลจะมีข้อมูลเพิ่มเข้ามาในตารางถือว่าสำเร็จ <br>
ถ้าไม่สำเร็จ 400 Bad request จะได้ผลลัพธ์ Responses body เป็นดังนี้

    {
	    "responseCode": "E000001", 
	    "responseMessage": "ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้",
	    "responseData": {
		     "userId": "WS233999", 
		      "tokenId": null 
	    }
    }





