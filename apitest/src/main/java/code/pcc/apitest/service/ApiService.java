package code.pcc.apitest.service;


import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import code.pcc.apitest.entity.ApiEntity;
import code.pcc.apitest.model.ApiModel;
import code.pcc.apitest.repository.ApiJpaRepository;




@Service
@Transactional
public class ApiService {

    @Autowired
    private ApiJpaRepository apiJpaRepository;



    public Object findAll() {
        return apiJpaRepository.findAll();
    }


    public void insert(ApiModel apiModel) {
        ApiEntity entity = new ApiEntity();
        entity.setRequest_date(new Date()); // ตั้งค่า request_date ให้ไม่ใช่ null
        entity.setSsotype(apiModel.getSsoType());
        entity.setSystemid(apiModel.getSystemId());
        entity.setSystemname(apiModel.getSystemName());
        entity.setSystemtransactions(apiModel.getSystemTransactions());
        entity.setSystemprivileges(apiModel.getSystemPrivileges());
        entity.setSystemusergroup(apiModel.getSystemUserGroup());
        entity.setSystemlocationgroup(apiModel.getSystemLocationGroup());
        entity.setUserid(apiModel.getUserId());
        entity.setUserfullname(apiModel.getUserFullName());
        entity.setUserrdofficecode(apiModel.getUserRdOfficeCode());
        entity.setUserofficecode(apiModel.getUserOfficeCode());
        entity.setClientlocation(apiModel.getClientLocation());
        entity.setLocationmachinenumber(apiModel.getLocationMachineNumber());
        entity.setTokenid(apiModel.getTokenId());
    
        apiJpaRepository.save(entity);
    }



    
}

