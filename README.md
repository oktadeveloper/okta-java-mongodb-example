# Java and MongoDB Example

This example app shows how to build a CRUD API with Java, MongoDB, and Spring Boot. See [](https://developer.okta.com/blog/2019/12/26/java-mongodb-crud) to see how it was built.

## Prerequisite

**Java 11**: This project uses Java 11. If you don’t have Java 11, you can install OpenJDK. Instructions are found on the  [OpenJDK website](https://openjdk.java.net/install/).

**Okta Developer Account**: Go to [the Okta website](https://developer.okta.com/signup/) and sign up for a free developer account, if you haven’t already.

> [Okta](https://developer.okta.com/) has Authentication and User Management APIs that reduce development time with instant-on, scalable user infrastructure. Okta's REST API and makes it easy for developers to authenticate, manage, and secure users + roles in any application.

* [Getting Started](#getting-started)
* [Create OIDC App](#create-a-new-oidc-app-in-okta)
* [Configure the Resource Server](#configure-the-resource-server)
* [Run the Resource Server](#run-the-resource-server)
* [Help](#help)
* [License](#license)

## Getting Started

To install this example application, run the following commands:

```bash
git clone https://github.com/oktadeveloper/okta-java-mongodb-example.git
```

## Create a New OIDC App in Okta

If you don't have an Okta developer account, please [create one](https://developer.okta.com/signup/). Then, create a new OIDC app on Okta:

1. Log in to your developer account, navigate to **Applications** > **Add Application**.
3. Select **Web** > **Next**.
4. Give the application a name
5. Under  **Login redirect URIs**, add a new URI: `https://oidcdebugger.com/debug`.
6. Under **Grant types allowed**, check **Implicit (Hybrid)**.
7. The rest of the default values will work. Click  **Done**.

Steps 4 & 5 are only needed if you want to use the [OpenID Connect Debugger](https://oidcdebugger.com/) to generate a test token.

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

Then use [OIDC Debugger](https://oidcdebugger.com/) to create an access token. Save the access token as a variable in your terminal:

```bash
TOKEN=eyJraWQiOiJrQkNxZ3o1MmQtOUhVSl94c0x4aGtzYlJxUDVD...
```

Now you can make authenticated and authorized requests.

```bash
$ http :8080 "Authorization: Bearer $TOKEN"

HTTP/1.1 200
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
...

{
    "_links": {
        "fridge": {
            "href": "http://localhost:8080/fridge{?page,size,sort}",
            "templated": true
        },
        "profile": {
            "href": "http://localhost:8080/profile"
        }
    }
}
```

## Help

Please post any questions as comments on the [blog post](https://developer.okta.com/blog/2019/12/26/java-mongodb-crud) or post them to Stack Overflow with the `okta` tag.

## License

Apache 2.0, see [LICENSE](LICENSE).
