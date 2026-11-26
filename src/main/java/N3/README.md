## Ejercicio:
Implementación del patrón Decorator para una aplicación deBubble Tea

### Objetivo
Implementar un diseño de clases que simule la personalización de un Bubble Tea, utilizando el patrón de diseño Decorator para añadir ingredientes como perlas, hielo, azúcar, etc.

### Descripción:
Se quiere construir una aplicación que permita crear Bubble Teas:

### Puedes empezar con una base como:

- 🥛  Latte → 3.50 €
- 🍵  Matcha → 3.20 €
- 🌿  Tea→ 3.00 €

y hay que añadir diferentes decoraciones como:

- 🧊 Gel ( Ice) → +0.25 €
- 🍬 Azúcar ( Sugar) → +0.30 €
- 🥥 Tapioca ( Tapioca) → +0.50 €
- 🍓 Sabores añadidos ( Flavor) → +0.60 € por cada sabor añadido.
- ℹ️ Si se añaden dos sabores, el coste total aumenta en +1.20€.

Cada añadido modifica el coste y descripción de la bebida. El objetivo es utilizar el patrón Decorator para poder componer las bebidas dinámicamente , sin tener que crear subclases para cada combinación posible.

### Requisitos:
- Crea una interfaz BubbleTeacon los métodos:
  - String getDescription();
  - double getCost();
- Implementa las clases base ( LatteBase, MatchaBase, TeaBase) que implementen BubbleTea. Cada base debe tener un coste inicial distinto y una descripción propia.
- Crea decoradores concretos (ej: Ice, Sugar, Tapioca, Flavor) que hereden de BubbleTeaDecorator.
- Cada decorador debe añadir al coste y descripción del Bubble Tea.
- Implementa tests unitarios en los que se muestre la creación de un Bubble Tea con varias combinaciones.