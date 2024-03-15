# Checkpoint 01 Microsservices | FIAP

#### O projeto consiste em criar uma aplicação Java com Spring Boot, Maven e Docker. O objetivo dessa prova era testar nossos conhecimentos criando um endpoint GET ping em 3 Spring Profiles diferentes, na mesma porta.

#### Segue o link com todas as especificações da prova, e abaixo estará os comandos Docker para poder executar o projeto. (https://github.com/acnaweb/microservices-2024/blob/main/checkpoints/checkpoint-1-sem1.md)


## Para poder executar aplicação a partir da imagem no Docker Hub com profile "dev"

```
  docker pull beassad/fiap-checkpoint1:latest
  docker run -p 8080:8080 -e "PROFILE=dev" beassad/fiap-checkpoint1
```

## Para poder executar aplicação a partir da imagem no Docker Hub com profile "stg"

```
docker pull beassad/fiap-checkpoint1:latest
docker run -p 8080:8080 -e "PROFILE=stg" beassad/fiap-checkpoint1
```

## Para poder executar aplicação a partir da imagem no Docker Hub com profile "prd"

```
docker pull beassad/fiap-checkpoint1:latest
docker run -p 8080:8080 -e "PROFILE=prd" beassad/fiap-checkpoint1
```

Após isso, basta ir no navegador, e procurar http:localhost:8080/ping
