### Create .env file 

```
# hostname or ip of receiver
RECEIVER_HOST=example-service

# port
RECEIVER_PORT=8080

# relative path 
RECEIVER_URI=/example/relative/path
```

### Modify (or create) docker-compose.yaml file

```
version: "3.3"

services:
  example-service:
    depends_on:
      - sfp-mock
      
  sfp-mock:
    container_name: sfp-mock
    image: ekiauhce/sfp-mock:latest
    env_file:
      - .env
```