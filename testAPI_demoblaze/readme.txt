Automatización de la API en DemoBlaze

Ejecución:

gradlew clean test

el comando permite ejecutar el runner ParallelTest mediante gradle wrapper y ejecutar los features de LogIn y SignUp

Se generan 2 tipos de reportes:
 1. Karate: En la ruta /testAPI_demoblaze/build/karate-reports/karate-summary.html
 2. Cucumber: En la ruta /testAPI_demoblaze/build/cucumber-html-reports/overview-features.html