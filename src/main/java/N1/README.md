## Ejercicio:
Implementación del patrón Builder en el menú de un restaurante.

## Objetivo
Diseñar e implementar un sistema para construir diferentes tipos de menús de restaurante aplicando el patrón de diseño Builder con estilo Fluent Builder y siguiendo los principios SOLID. Además, se utilizará el concepto de progresive interface , que consiste en limitar progresivamente las opciones disponibles al usuario durante la construcción del objeto, asegurando así que el proceso se realice en el orden correcto y se cumplan las dependencias entre pasos . Por ejemplo, no se podrá añadir postre antes de añadir el plato principal, ni tampoco se podrá llamar el método de añadir postre más de una vez.

## Descripción
En los menús pueden estar compuestos por:

- Entrantes
- Plato Principal
- Postre
- Bebida

Éstos pueden tener características específicas:

- Cualquier plato puede ser: Vegano y/o Apropiado para celíacos.
- El plato principal puede tener un suplemento (por ejemplo: guarnición extra).
- Además, el cliente puede solicitar sólo el medio menú, que incluye únicamente el plato principal y la bebida.
- El menú infantil incluye sólo plato principal, bebida y postre.
- Los menús pueden ser sin bebida.
- El postre es opcional en todos los menús y puede ser postre o café.
## Requisitos:
- Modelar un sistema flexible para construir menús paso a paso, sin dependencias de clases concretas, que garantice el orden correcto y obligatorio en la construcción del menú. Por ejemplo, no se podrá añadir postres antes de añadir el plato principal.
- Implementar una restricción por la que, si se elige postre, no se podrá añadir café, y viceversa. Esta regla debe garantizarse gracias al diseño de interfaces .
- Permitir configurar las propiedades de los platos (vegano, apta para celíacos, suplemento) con métodos fluyentes y expresivos, evitando parámetros booleanos.
- Implementa tests unitarios donde se muestre la creación varios menús:

## Execution
- he empezado creando una clase Apetizer y un builder AppetizerBuilder, siguiendo la idea del patròn builder.