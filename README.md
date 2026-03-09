# Conversor de Moneda en Java 💱

Proyecto desarrollado en Java que permite convertir diferentes monedas utilizando una API de tasas de cambio en tiempo real.

## 📌 Tecnologías utilizadas

* Java
* HttpClient
* Gson
* ExchangeRate API
* IntelliJ IDEA
* Git y GitHub

---

# 🚀 Descripción

Este proyecto consume la API de ExchangeRate para obtener las tasas de cambio actualizadas y permite al usuario realizar conversiones entre diferentes monedas desde la consola.

El programa realiza:

1. Solicitud HTTP a la API
2. Obtención de datos en formato JSON
3. Procesamiento del JSON usando la biblioteca Gson
4. Conversión entre monedas
5. Interacción con el usuario mediante un menú en consola

---

# 🌐 API utilizada

ExchangeRate API

Ejemplo de solicitud:

https://v6.exchangerate-api.com/v6/TU_API_KEY/latest/USD

---

# 💰 Monedas soportadas

* USD — Dólar estadounidense
* ARS — Peso argentino
* BRL — Real brasileño
* COP — Peso colombiano

---

# 📂 Estructura del proyecto

```
conversor_de_moneda
│
├── src
│
├── principal
│   └── Principal.java
│
├── servicios
│   └── ConsultaMoneda.java
│
├── modelos
│   └── Conversor.java
│
└── README.md
```

---

# ▶️ Cómo ejecutar el proyecto

1. Clonar repositorio

```
git clone https://github.com/TU_USUARIO/conversor_de_moneda.git
```

2. Abrir proyecto en IntelliJ

3. Ejecutar la clase:

```
Principal.java
```

---

# 📊 Ejemplo de uso

```
Sea bienvenido/a al Conversor de Moneda

1) USD -> ARS
2) ARS -> USD
3) USD -> BRL
4) BRL -> USD
5) USD -> COP
6) COP -> USD
7) Salir
```

El usuario ingresa el monto y el sistema devuelve el valor convertido.

---

# 👨‍💻 Autor

Proyecto desarrollado como práctica de consumo de API y manejo de JSON en Java.

Kevin Gamarra
