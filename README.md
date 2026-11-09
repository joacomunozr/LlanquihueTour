# LlanquihueTour

## Descripción
Programa en Java que representa a los empleados de la agencia de turismo Llanquihue Tour. Cada empleado tiene sus datos personales, su cargo, sus años de experiencia y una dirección.

## Estructura
- `model/`: las clases del programa: Direccion, Persona y Empleado.
- `app/`: la clase Main, que crea 3 empleados y los muestra en pantalla.

## Relaciones entre clases
- Persona tiene una Direccion (composición).
- Empleado extiende Persona (herencia).

## Cómo compilar y ejecutar
Necesitas tener Java instalado.

**Con consola:**
1. Abre una consola en la carpeta del repositorio, donde están `app` y `model`.
2. Compila: `javac model/*.java app/*.java`
3. Ejecuta: `java app.Main`

**Con NetBeans:**
1. Crea un proyecto nuevo de tipo Java Application.
2. Copia las carpetas `app` y `model` dentro de la carpeta `src`.
3. Ejecuta la clase `Main` del paquete `app`.

## Autor
Joaquín Muñoz Riquelme
