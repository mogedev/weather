# Finvivir
## Prueba Tecnica

[![mogedev](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGuWrfLHbMlkXKF8uj7G7Bs98zmNZVW26YgRmGktRA3w&s)](https://github.com/mogedev/weather)

## Tecnologias

Tecnologias utilizadas:

- [Spring Boot] - Java Framework
- [JPA] - Persistencia de Datos
- [Feign] - Cliente HTTP para el consumo de APIs externas
- [Maven] - Herramienta para la gestion  construccion de proyectos Java
- [Docker] - Herramienta que ayuda a desplegar de manera mas rapida los sistemas

## Instalacion
Clonamos el proyecto de github

```sh
git clone https://github.com/mogedev/weather.git
```

Esta prueba requiere de [Maven] v3.8.6 para correr.
Instalamos las dependencias del proyecto.

```sh
cd weather
mvn clean install
```

Corremos de manera local con el comando de spring-boot

```sh
mvn spring-boot:run
```

## Docker

Para correr esta prueba en docker siga los siguientes pasos:

```sh
cd weather
docker build -t finvivir/prueba-tecnica:0.0.1 .
```

Una vez creada la imagen, procedemos a levantar correr el contenedor de Docker:

```sh
docker run -p 8080:8084 finvivir/prueba-tecnica:0.0.1
```

Verificar que este desplegado de manera correcta en:

```sh
127.0.0.1:8080/swagger-ui/index.html
```

## License

MIT

[Spring Boot]: <https://spring.io/projects/spring-boot>
[JPA]: <https://spring.io/projects/spring-data-jpa>
[Feign]: <https://spring.io/projects/spring-cloud-openfeign>
[Maven]: <https://maven.apache.org/>
[Docker]: <https://www.docker.com/>