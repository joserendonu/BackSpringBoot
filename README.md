🏢 API de Gestión de Franquicias - Spring Boot
📌 Descripción

Esta aplicación es una API REST desarrollada con Spring Boot que permite gestionar franquicias, sus sucursales y productos.

Permite realizar operaciones CRUD y consultas específicas como obtener el producto con mayor stock por sucursal.

🚀 Tecnologías utilizadas
Java 17
Spring Boot
Maven
REST API
JSON
📁 Estructura del proyecto
src/main/java/com/prueba/demo
│
├── controller   → Controladores REST
├── model        → Entidades (Franquicia, Sucursal, Producto)
├── dto          → Objetos de transferencia de datos
└── DemoApplication.java
▶️ Ejecución del proyecto
Clonar el repositorio:
git clone <URL_DEL_REPOSITORIO>
Acceder al proyecto:
cd demo
Ejecutar la aplicación:
.\mvnw spring-boot:run
La aplicación estará disponible en:
http://localhost:8080
📬 Endpoints disponibles
🟢 1. Crear franquicia

POST /franquicias

{
  "nombre": "Mi Franquicia",
  "sucursales": []
}
🟢 2. Listar franquicias

GET /franquicias

🟢 3. Agregar sucursal

POST /franquicias/{franquicia}/sucursales

{
  "nombre": "Sucursal Medellin",
  "productos": []
}
🟢 4. Agregar producto

POST /franquicias/{franquicia}/sucursales/{sucursal}/productos

{
  "nombre": "Aceite",
  "stock": 10
}
🟢 5. Actualizar stock

PUT /franquicias/{franquicia}/sucursales/{sucursal}/productos/{producto}

{
  "stock": 50
}
🟢 6. Eliminar producto

DELETE /franquicias/{franquicia}/sucursales/{sucursal}/productos/{producto}

🟢 7. Producto con mayor stock por sucursal

GET /franquicias/{franquicia}/productos-mayor-stock

Respuesta:

[
  {
    "sucursal": "Sucursal Medellin",
    "producto": "Aceite",
    "stock": 50
  }
]
⚠️ Consideraciones
Los datos se almacenan en memoria (no hay base de datos)
La información se pierde al reiniciar la aplicación
Los nombres se usan como identificadores
🔧 Posibles mejoras
Implementar persistencia con base de datos (MySQL, PostgreSQL)
Usar identificadores únicos (ID)
Separar lógica en capas (Service, Repository)
Manejo de excepciones personalizado
Validaciones con @Valid
👨‍💻 Autor

Desarrollado como prueba técnica utilizando Spring Boot.

<!-- Spring boot -->

LINK VIDEO GUIA:
https://www.youtube.com/watch?v=TZW8DaMt0jc
Voy en el 2:51


Se almacenarán los datos en Mysql