# 🏦 Proyecto Banco XYZ - Microservicios y BFFs

Este repositorio forma parte de una arquitectura distribuida compuesta por microservicios y BFFs que interactúan con una base de datos MySQL en contenedor Docker. Los BFFs están protegidos con HTTPS y Spring Security.

---

### ✅ `bff_web_bancoxyz`

```markdown
# 📁 ms_bff_web_bancoxyz

**Descripción:**  
Backend for Frontend (BFF) para clientes web. Se conecta a microservicios mediante REST y está protegido con HTTPS y Spring Security.

**Tecnologías:**  
- Java 17 + Spring Boot  
- Spring Security  
- HTTPS (keystore.p12)  
- Maven

**Seguridad:**  
- Autenticación HTTP Basic (`user` / `password`)  
- Certificado HTTPS generado con `keytool`

**Configuración rápida:**
```bash
git clone https://github.com/LeoOlivaresD/ms_bff_web_bancoxyz.git
mvn spring-boot:run
