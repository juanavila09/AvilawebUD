# AvilaWebUD

Proyecto académico desarrollado para la asignatura de **Aplicaciones Web** — Universidad Distrital Francisco José de Caldas.

## Descripción

Aplicación web Java EE que incluye dos módulos:

- **Simulador de CDT**: calcula la ganancia, valor futuro e impuesto del 4% (gravamen a los movimientos financieros) de un Certificado de Depósito a Término según el monto invertido, la tasa de interés efectiva anual y el plazo en días.
- **Registro de Aspirante Universitario**: formulario de registro de aspirantes con selección de programa académico.

## Tecnologías

- Java 21
- Jakarta EE 10
- Jakarta Faces (JSF) 4.0.1
- CDI (Contexts and Dependency Injection)
- Maven
- Eclipse IDE
- Servidor: WildFly / Tomcat con soporte Jakarta EE 10

## Arquitectura — Patrón MVC

El proyecto sigue el patrón **Modelo-Vista-Controlador**:

```
src/main/java/
├── cdt/
│   ├── modelo/          → Modelo (CDT, CalculadoraCDT)
│   └── controlador/     → Controlador (CDTBean)
└── asp/
    ├── modelo/          → Modelo (Aspirante, Persona, ProgAcad, DAOs)
    └── bean/            → Controlador (AspiranteBean)

src/main/webapp/
├── cdt.xhtml            → Vista del simulador
├── asp.xhtml            → Vista del registro
├── index.xhtml          → Vista principal
└── resources/css/       → Hojas de estilo
```

## Documentación

El diagrama de clases del módulo CDT se encuentra en `docs/diagrama-clases.png`.

## Cómo ejecutar

1. Importar el proyecto en Eclipse como **Existing Maven Project**.
2. Configurar un servidor compatible con Jakarta EE 10 (WildFly recomendado).
3. Click derecho sobre el proyecto → **Run As → Run on Server**.
4. Acceder a `http://localhost:8080/AvilaWebUD/`.

## Autora

**Juana Avila**  
Tecnología en Sistematización de Datos  
Universidad Distrital Francisco José de Caldas  
2026
  
---  
Ultima actualizacion: Mayo 2026 
