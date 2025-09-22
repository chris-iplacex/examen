# 📌 Proyecto: Calculadora en Java

## 🚀 Descripción  
Este proyecto implementa una **calculadora básica en Java**, desarrollada con **Maven** como gestor de dependencias y compilación.  
El proyecto incluye **pruebas unitarias (JUnit)** y un **workflow de integración continua (CI)** con GitHub Actions para asegurar que el código siempre compile y pase los tests antes de integrarse a la rama principal.  

---

## 🎯 Objetivos del Proyecto
- Practicar el uso de **Java con Maven**.  
- Implementar una **calculadora** con operaciones básicas.  
- Incluir **tests automatizados** para verificar el correcto funcionamiento.  
- Configurar un **pipeline CI/CD en GitHub Actions** que valide automáticamente cada `push` y `pull request`.  

---

## 📂 Estructura del Proyecto
```
Calculadora/
│── pom.xml                  # Configuración de Maven
│── src/
│   ├── main/
│   │   └── java/cl/iplacex/
│   │       ├── Calculadora.java   # Lógica de la calculadora
│   │       └── Main.java          # Clase principal
│   └── test/
│       └── java/
│           └── CalculadoraTest.java  # Pruebas unitarias
│── .github/
│   └── workflows/
│       └── ci.yml               # Pipeline de CI con GitHub Actions
```

---

## 🛠️ Comandos principales
Para compilar y ejecutar el proyecto con Maven:

```bash
# Compilar el proyecto
mvn compile

# Ejecutar la aplicación
mvn exec:java -Dexec.mainClass="cl.iplacex.Main"

# Ejecutar los tests
mvn test

# Construir el paquete (JAR)
mvn package
```

---

## ✅ Tests
Las pruebas se encuentran en `src/test/java/CalculadoraTest.java`.  
Estas validan las operaciones principales de la calculadora (suma, resta, multiplicación, división, etc.), asegurando que el programa funcione correctamente.  

Ejecutar pruebas:
```bash
mvn test
```

---

## 🔄 CI/CD Workflow
El proyecto incluye un **workflow de CI en GitHub Actions** (`.github/workflows/ci.yml`) que:  
1. Se ejecuta automáticamente en cada `push` o `pull request` hacia la rama `main` o `feature/**`.  
2. Descarga el código del repositorio.  
3. Configura **Java 17**.  
4. Compila el proyecto con Maven.  
5. Ejecuta los tests y valida que todo funcione.  

De esta manera, se asegura que **no se integren cambios defectuosos** en la rama principal.  

---

✍️ Autor: Christian Acuña
