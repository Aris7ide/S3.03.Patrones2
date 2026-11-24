## Ejercicio:
Implementación del patrón Observer en un sistema de notificación de cambios de la Bolsa

### Objetivo
Construir un sistema en el que un Agente de Bolsa (Observable) notifique automáticamente a varias agencias de Bolsa (Observers) cada vez que se produce un cambio del estado de la Bolsa (subida o bajada).

### Descripción
Diseña una clase StockAgentque:
- Permita a los observadores suscribirse y cancelar la suscripción.
- Tenga métodos para simular cuándo la bolsa sube o baja el valor de las acciones.
- Cuando la bolsa sube o baja, notifique automáticamente a todos los observadores con un mensaje que indique el cambio y el nuevo valor de las acciones.
Diseña también diversas clases concretas de observadores que:
- Se inscriban en el StockAgent.
- Cuando sean notificados, muestren por pantalla el mensaje de la notificación indicando si la bolsa ha subido o descargado y el valor actual.

### Requisitos
- El objeto Observable debe mantener referencias a sus observadores.
- Debe ser posible añadir y eliminar observadores dinámicamente.
- Cuando la AgenteBolsa cambie de estado (sube o baja), debe llamar a notifyObservers().
- Cada observador debe mostrar el mensaje recibido.
El programa debe probarse mediante tests unitarios la:
- suscripción de varios observadores al agente de bolsa.
- simulación de subidas y bajadas de la bolsa.
- serificación que los observadores reciben y muestran correctamente los mensajes esperados.

### Exectution
- He creado las interfaces Observer y Observable y las clases StockAgent y Observerr