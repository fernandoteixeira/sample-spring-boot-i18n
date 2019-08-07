# Spring Boot i18n Example

### Request with English Accept-Language header
```
curl http://localhost:8080 -H 'Accept-Language: en'
```

### Request with Portuguese Accept-Language header
```
curl http://localhost:8080 -H 'Accept-Language: pt'
```

### Request with invalid Accept-Language header
```
curl http://localhost:8080 -H 'Accept-Language: blablabla'
```