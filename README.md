# Postcode API

A Java & Spring Boot backend service for Australian postcodes.
All users can retrieve postcodes, while Admins can create new postcode combinations

---

## Requirements / Purpose

-   MVP:
    -   An API that allows clients to retrieve the suburb information by postcode
    -   An API that allows clients to retrieve postcode given a suburb name
    -   Secured API to add new suburb and postcode combinations
    -   Database
    -   Tests for controller and service layers
-   Stack used:
    -   Java and Spring was used for the backend service due to its features and functionality

---

## Build Steps

-   Run the PostcodeapiApplication.java in `src/main/java/io/nology/postcodeapi/` folder
-   Interact with the API using Postman or browser
-   Endpoints are:
    -   GET all -> localhost:8080/postcode
    -   GET by postcode -> localhost:8080/postcode/{postcode}
    -   GET by suburb -> localhost:8080/postcode/{suburb}
    -   Test the admin (GET) -> localhost:8080/postcode/admin
    -   POST new combination -> localhost:8080/postcode/admin

```bash
Admin credentials:
Username: admin
Password: password
```

---

## Features

-   Retrieve suburb information by postcode
-   Retrieve postcode given a suburb
-   Authentication layer to allow adding new suburb and postcode combinations

---

## Known issues

---

## Future Goals

-   Tests for the controller and service layer

---

## Change logs

### 04/09/2023- Initial commit

-   Extended the expiry time of JWT tokens on the backend
-   Added users to cohort response payload
-   Centralized API base URL on frontend using the proxy `package.json` property

### 05/09/2023- Added database data, Controller, Service and Repository layer

-   Seeded database using Object Mapper on postcode JSON
-   Added Entity, Controller, Repository and Service layers

### 18/09/2023- Added basic HTTP secure layer

-   Secure layer added to /postcode/admin end point

---

## What did you struggle with?

-

---

## Licensing Details

-   Feel free to use this code!

---
