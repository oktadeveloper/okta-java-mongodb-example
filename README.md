# Spring MVC and MongoDB 

This example app shows how to build a CRUD application with MongoDB and Spring Boot.

## Prerequisite

**Java 11**: This project uses Java 11. If you don’t have Java 11, you can install OpenJDK. Instructions are found on the  [OpenJDK website](https://openjdk.java.net/install/). OpenJDK can also be installed using  [Homebrew](https://brew.sh/).  [SDKMAN](https://sdkman.io/)  is another great option for installing and managing Java versions.

**HTTPie**: This is a simple command-line utility for making HTTP requests. You’ll use this to test the REST application. Check out  [the installation instructions on their website](https://httpie.org/doc#installation).

**Okta Developer Account**: You’ll be using Okta as an OAuth/OIDC provider to add JWT authentication and authorization to the application. Go to  [their website](https://developer.okta.com/signup/)  and sign up for one of their free developer accounts, if you haven’t already.

> [Okta](https://developer.okta.com/) has Authentication and User Management APIs that reduce development time with instant-on, scalable user infrastructure. Okta's REST API and makes it easy for developers to authenticate, manage, and secure users + roles in any application.

* [Getting Started](#getting-started)
* [Help](#help)
* [License](#license)

## Getting Started

To install this example application, run the following commands:

```bash
git clone https://<need.a.link>
```

## Create a New OIDC App in Okta

If you don't have an Okta developer account, please [create one](https://developer.okta.com/signup/). Then, create a new OIDC app on Okta:

1. Log in to your developer account, navigate to **Applications** > **Add Application**.
3. Select **Web** > **Next**.
4. Give the application a name
5. Under  **Login redirect URIs**, add a new URI: `https://oidcdebugger.com/debug`.
6. Under **Grant types allowed**, check **Implicit (Hybrid)**.
7. The rest of the default values will work. Click  **Done**.

## Configure the Resource Server

You need to add the Issuer URI from your Okta account to the `src/main/resources/application.properties` file. To find your Issuer URI, go to **API** -> **Authorizaiton Servers**.

```properties
okta.oauth2.issuer=https://{yourOktaUrl}/oauth2/default
```

## Run the Resource Server

To run the SpringMVC resource server, run:

```bash
./gradlew bootRun
```

## Help

Please post any questions as comments on the [blog post]() or post them to Stack Overflow with the `okta` tag.

## License

Apache 2.0, see [LICENSE](LICENSE).
