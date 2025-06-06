# emailgenerator
This project is a Spring Boot-based backend application designed to send emails reliably with retry logic and status tracking. It simulates the behavior of sending emails using multiple providers to ensure high availability and fault tolerance. The service is designed with idempotency, persistence, and provider fallback mechanisms in mind, making it robust against temporary failures or duplicate requests.

The backend consists of RESTful APIs to send, update, check the status of, and delete email requests. The core logic resides in the EmailService class, where each email goes through up to three attempts using different simulated providers. Statuses such as "SENT", "FAILED", or "QUEUED" are recorded in a database using JPA entities EmailRequest and EmailStatus.

The controller exposes endpoints for clients to interact with the email service. Clients can submit a request to /api/email/send, retrieve email status via /api/email/status/{id}, update emails using /api/email/update, and delete them via /api/email/delete/{id}. These endpoints make integration with frontend systems or external applications straightforward.

Overall, this project demonstrates best practices in building a resilient backend service with Spring Boot, including idempotent request handling, layered architecture (controller-service-repository), and the use of random simulation to test multi-provider retry strategies.
