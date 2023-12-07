# Proyectos de Automatización QA - Sector Financiero/Bancario

Este README contiene detalles sobre los dos proyectos de automatización requeridos como parte del proceso de selección para el cargo de QA Automation Engineer en el sector financiero/bancario.

## Proyecto 1: Prueba Funcional E2E en [SauceDemo](https://www.saucedemo.com/)

### Objetivo
Realizar una prueba funcional automatizada (Prueba E2E) del flujo de compra en la página https://www.saucedemo.com/ El flujo de compra debe incluir los siguientes pasos:

    1. Agregar dos productos al carrito.
    2. Visualizar el carrito.
    3. Completar el formulario de compra.
    4. Finalizar la compra.

### Tecnologías Utilizadas
- Lenguaje de programación: Gherkin, java
- Framework de automatización: Serenity BDD (Screenplay pattern)

### Ejecución de las Pruebas
Desde la raíz de proyecto en la carpeta \saucedemo_devsu ejecutar por línea de comando

gradlew clean test 

## Proyecto 2: Automatización de la API en [DemoBlaze](https://www.demoblaze.com/)

### Objetivo
Este proyecto se centra en la automatización de las funcionalidades de registro signup y login proporcionadas por la API de https://api.demoblaze.com/

### Casos a Automatizar
    1. Crear un nuevo usuario en signup.
    2. Intentar crear un usuario ya existente.
    3. Verificar el inicio de sesión con usuario y contraseña correctos.
    4. Verificar el inicio de sesión con usuario y contraseña incorrectos.

### Tecnologías Utilizadas
- Lenguaje de programación: JavaScript, Gherkin, Java
- Framework de automatización: Karate

### Ejecución de las Pruebas
Desde la raíz de proyecto en la carpeta \testAPI_demoblaze ejecutar por línea de comando

gradlew clean test 


