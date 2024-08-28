// Test case 1
//  Successful user validation 

curl --location 'https://bfhldevapigw.healthrx.co.in/automation-campus/create/user' \
--header 'roll-number: 1' \
--header 'Content-Type: application/json' \
--data-raw '{
  "firstName": "John",
  "lastName": "Doe",
  "phoneNumber": 1234567890,
  "emailId": "john.doe@example.com"
}'

// Test case 2
// Missing roll number

curl --location 'https://bfhldevapigw.healthrx.co.in/automation-campus/create/user' \
--header 'Content-Type: application/json' \
--data-raw '{
  "firstName": "John",
  "lastName": "Doe",
  "phoneNumber": 1234567890,
  "emailId": "john.doe@example.com"
}'

// Test case 3
// Missing first name

curl --location 'https://bfhldevapigw.healthrx.co.in/automation-campus/create/user' \
--header 'roll-number: 111' \
--header 'Content-Type: application/json' \
--data-raw '{
  "lastName": "Doe",
  "phoneNumber": 1234567890,
  "emailId": "john.doe@example.com"
}'

// Test case 4
// Invalid phone no format

curl --location 'https://bfhldevapigw.healthrx.co.in/automation-campus/create/user' \
--header 'roll-number: 10' \
--header 'Content-Type: application/json' \
--data-raw '{
  "firstName": "John",
  "lastName": "Doe",
  "phoneNumber": 12345,
  "emailId": "john.doe@example.com"
}'

// Test case 5
// Invalid email format

curl --location 'https://bfhldevapigw.healthrx.co.in/automation-campus/create/user' \
--header 'roll-number: 100' \
--header 'Content-Type: application/json' \
--data-raw '{
  "firstName": "John",
  "lastName": "Doe",
  "phoneNumber": 1234567890,
  "emailId": "john.doe@.com"
}'

// Test case 6
// User already exist

curl --location 'https://bfhldevapigw.healthrx.co.in/automation-campus/create/user' \
--header 'roll-number: 101' \
--header 'Content-Type: application/json' \
--data-raw '{
  "firstName": "John",
  "lastName": "Doe",
  "phoneNumber": 1234567890,
  "emailId": "john.doe@example.com"
}'

curl --location 'https://bfhldevapigw.healthrx.co.in/automation-campus/create/user' \
--header 'roll-number: 102' \
--header 'Content-Type: application/json' \
--data-raw '{
  "firstName": "Jane",
  "lastName": "Doe",
  "phoneNumber": 1234567890,
  "emailId": "jane.doe@example.com"
}'

// Test case 7
// Email already exist

curl --location 'https://bfhldevapigw.healthrx.co.in/automation-campus/create/user' \
--header 'roll-number: 123' \
--header 'Content-Type: application/json' \
--data-raw '{
  "firstName": "John",
  "lastName": "Doe",
  "phoneNumber": 1234567890,
  "emailId": "john.doe@example.com"
}'

curl --location 'https://bfhldevapigw.healthrx.co.in/automation-campus/create/user' \
--header 'roll-number: 234' \
--header 'Content-Type: application/json' \
--data-raw '{
  "firstName": "Jane",
  "lastName": "Doe",
  "phoneNumber": 9876543210,
  "emailId": "john.doe@example.com"
}'

// Test case 8
//Character limit exceded

curl --location 'https://bfhldevapigw.healthrx.co.in/automation-campus/create/user' \
--header 'roll-number: 11' \
--header 'Content-Type: application/json' \
--data-raw '{
  "firstName": "A very long first name exceeding normal limits",
  "lastName": "A very long last name exceeding normal limits",
  "phoneNumber": 1234567899,
  "emailId": "long.email.address.with.excessive.characters@example.com"
}'
