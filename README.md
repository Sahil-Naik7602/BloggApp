# Blogging App Backend

This is the backend component of a blogging app developed using Java Spring Boot. It provides the necessary functionality to manage users, articles, and comments for your blogging platform.

## Table of Contents

- [Features](#features)
- [Entities](#entities)
- [API Endpoints](#api-endpoints)
- [Database Architecture](#database-architecture)

## Features

- User Management: Register, authenticate, and manage user accounts.
- Article Management: Create, read, update, and delete articles.
- Comment System: Add comments to articles and manage them.
- Secure Authentication: Implements user authentication and authorization for protected endpoints.
- RESTful API: Built on the principles of Representational State Transfer (REST).

## Entities

### User
```
{
    "id": 1,
    "username": "SkNaik",
    "email":    "sktest02@yahoo.com",
    "password": "xxxxxx-xxxxxxx",
    "auth-token":"afschjsjkdaksnd",
    "bio":      "Hi I am a blog-enthusiast",
    "image":    "https://imageurl.com/sk.png"
}
```
### Profile
```
{
    "username": "SkNaik",
    "bio":      "Hi I am a blog-enthusiast",
    "image":    "https://imageurl.com/sk.png"
}
```
### Articles
```
{
    id": 1,
    "title": "How the stocke market fell in 2022",
    "subtitle": "An article about the stock market crash in 2022",
    "body": "Stock Market crash.........",
    "CreatedAt": "2023-02-06 03:40:55",
    "tags": ["finance","stock"]
}
```
### Comments
```
{
    "id": 1,
    "title": "Graet Article",
    "body":  "This was a great article, Loved Reading it!",
    "createdAt":"2022-02-07 08:40:55"
}
```

### API Endpoints
`POST /users` create new users
`POST /users/login`
`GET /profiles`
`GET /profiles/{username}`
`GET /articles` 
- default page size is 10
- available filters
    - `/articles?tags=stock`
    - `/articles?author=sahil`
    - `/articles?page=3&size=10`


`GET /articles/{article-slug}`
`POST /articles` create new articles
`PATCH /articles/{article-slug}`
`GET /article/{article-slug}/comments` get all comments of an article
`POST /article/{article-slug}/comments` post a cooment
`DELETE /article/{article-slug}/comments/{comment-id}` delete a specific comment

## Database Architecture
![databse_blogapp](https://github.com/Sahil-Naik7602/BloggApp/assets/93373968/e680b9ed-a9f3-4ac2-add5-50c0e82d09d1)
