<b>ทำการติดตั้ง</b> <br>
  Spring Boot Framework Version 2.6.10 <br>
  JAVA JDK Version 17 <br>
  PostgreSQl Version 14.9.1 <br>
  DBeaver <br>
<br>
<b>ไฟล์ pom.xml</b> <br>
เชื่อมกับ Swagger ใช้ Maven Repository<br>
SpringDoc OpenAPI UI Version 1.6.5 <br>
Swagger Annotations Version 1.5.20 <br>
<br>
<b>การทดสอบ</b> <br>
ใช้โปรแกรม DBeaver เข้าถึงฐานข้อมูล <br>
แถบบนเลือก Database > New Datebase Connection <br>
จะโชว์หน้าต่าง Connect to a database เลือก PostgreSQl แล้วใส่ข้อมูลตามนี้<br>
Host : localhost <br>
Port : 5432 <br>
Database : ssotest <br>
Username : ssodev <br>
Password : sso2022ok <br>
<br>
เว็บไซต์เข้า URL : http://localhost:8080/apitest/swagger-ui/index.html <br>
เลือก /service/gentoken กด try it out ใส่ Request body <br>
ตัวอย่าง Request <br>
{ <br>
  "ssoType": "SSOData", <br>
  "systemId": "VATDEDEV", <br>
  "systemName": "ระบบบันทึกข้อมูลภาษีมูลค่าเพิ่มทดสอบ", <br>
  "systemTransactions": "PRIV-010,PRIV-020,PRIV-040,PRIV-050", <br>
  "systemPrivileges": "0|0|0|0", <br>
  "systemUserGroup": "GRP-010,GRP-020,GRP-040", <br>
  "systemLocationGroup": "CliC001", <br>
  "userId": "WS233999", <br>
  "userFullName": "ประสาท จันทร์อังคาร ", <br>
  "userRdOfficeCode": "01000999", <br>
  "userOfficeCode": "01001139", <br>
  "clientLocation": "01001139", <br>
  "locationMachineNumber": "CLI00000718-9999", <br>
  "tokenId": <br>
  "eyJzdWIiOiIxMjM0IiwiYXVkIjpbImFkbWluIl0sImlzcyI6Im1hc29uLm1ldGFtdWcubmV0IiwiZXhwIjoxNTc0NTEyNzY1LCJpYXQiOjE1NjY3MzY3NjUsImp0aSI6ImY3YmZlMzNmLTdiZjctNGViNC04ZTU5LTk5MTc5OWI1ZWI4YSJ9" <br>
} <br>
กดเลือก execute <br>
ถ้าสำเร็จ 200 OK จะได้ผลลัพธ์ Responses body เป็นดังนี้ <br>
{ <br>
  "responseCode": "I07000", <br>
  "responseMessage": "ทำรายการเรียบร้อย", <br>
  "responseData": { <br>
    "userId": "WS233999", <br>
    "tokenId": <br>
    "eyJzdWIiOiIxMjM0IiwiYXVkIjpbImFkbWluIl0sImlzcyI6Im1hc29uLm1ldGFtdWcubmV0IiwiZXhwIjoxNTc0NTEyNzY1LCJpYXQiOjE1NjY3MzY3NjUsImp0aSI6ImY3YmZlMzNmLTdiZjctNGViNC04ZTU5LTk5MTc5OWI1ZWI4YSJ9" <br>
  } <br>
} <br>
ตรวจสอบฐานข้อมูลจะมีข้อมูลเพิ่มเข้ามาในตาราง <br>
ถ้าไม่สำเร็จ 400 Bad request จะได้ผลลัพธ์ Responses body เป็นดังนี้ <br>
{ <br>
  "responseCode": "E000001", <br>
  "responseMessage": "ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้", <br>
  "responseData": { <br>
    "userId": "WS233999", <br>
    "tokenId": null <br>
  } <br>
} <br>






