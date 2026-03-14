# API Banco

## Descripción

Este proyecto implementa una **API REST para la gestión de clientes y empleados de un banco**.
La API permite consultar información de clientes y realizar operaciones CRUD básicas sobre empleados.

El contrato de la API está definido usando **OpenAPI 3.0**, lo que permite documentar y estandarizar los endpoints del servicio.

---

## Tecnologías utilizadas

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* Lombok
* OpenAPI / Swagger
* Maven
* IntelliJ IDEA

---

## Estructura del proyecto

El proyecto sigue una arquitectura en capas:

```
src/main/java/com/banco/api
│
├── controller
│   └── EmpleadoController.java
│
├── service
│   └── EmpleadoService.java
│
├── repository
│   └── EmpleadoRepository.java
│
├── model
│   └── Empleado.java
│
└── BancoApplication.java
```

---

## Endpoints disponibles

### Obtener información de cliente

```
GET /api/banco/cliente/{codCliente}
```

Obtiene la información de un cliente y su cuenta.

---

### Registrar empleado

```
POST /api/banco/empleado
```

Body ejemplo:

```json
{
  "dni": "87654321",
  "nombre": "Carlos",
  "apellidos": "Ramirez",
  "puesto": "Cajero",
  "edad": 28
}
```

---

### Listar empleados

```
GET /api/banco/empleados
```

Devuelve la lista de todos los empleados registrados.

---

### Buscar empleado por DNI

```
GET /api/banco/empleado/{dni}
```

Permite obtener la información de un empleado específico usando su DNI.

---

### Eliminar empleado

```
DELETE /api/banco/empleado/{dni}
```

Elimina un empleado del sistema.

---

