# Postcode API

{add test badges here, all projects you build from here on out will have tests, therefore you should have github workflow badges at the top of your repositories: [Github Workflow Badges](https://docs.github.com/en/actions/monitoring-and-troubleshooting-workflows/adding-a-workflow-status-badge)}

## Demo & Snippets

-   Include hosted link
-   Include images of app if CLI or Client App

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

-   how to build / run project
-   use proper code snippets if there are any commands to run

---

## Design Goals / Approach

-   Design goals
-   why did you implement this the way you did?

---

## Features

-   Retrieve suburb information by postcode
-   Retrieve postcode given a suburb
-   Authentication layer to allow adding new suburb and postcode combinations

---

## Known issues

-   Remaining bugs, things that have been left unfixed
-   Features that are buggy / flimsy

---

## Future Goals

-   What are the immediate features you'd add given more time

---

## Change logs

-   Write a paragraph labelled with the date every day you work on the project to discuss what you've done for the say. Be specific about the changes that have happened for that day.

### 04/09/2023- Initial commit

-   Extended the expiry time of JWT tokens on the backend
-   Added users to cohort response payload
-   Centralized API base URL on frontend using the proxy `package.json` property

### 05/09/2023- Added database data, Controller, Service and Repository layer

-   Seeded database using Object Mapper on postcode JSON
-   Added Entity, Controller, Repository and Service layers

---

## What did you struggle with?

-   What? Why? How?

---

## Licensing Details

-   What type of license are you releasing this under?

---

## Further details, related projects, reimplementations

-   Is this project a reimplementation for something you've done in the past? if so explain it and link it here.
-   If it's an API, is there a client app that works with this project? link it
