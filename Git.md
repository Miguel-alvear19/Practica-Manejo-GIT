**1-** Un repositorio en Git es básicamente una base de datos especial donde se guarda todo el historial de cambios de un proyecto: cada archivo, cada modificación y cada versión quedan registrados. Esto permite que tú (y otros colaboradores) puedan volver atrás, comparar versiones, trabajar en paralelo y fusionar cambios sin perder información.
Un proyecto “normal” es solo una carpeta con archivos. Un repositorio Git es esa misma carpeta, pero con un sistema de control de versiones que te da poder para rastrear, revertir y colaborar de manera organizada.

---------------------------------------------------------------------------------------------

**2-** 
- **Working Directory** 
    - *¿que es y para que sirve?* Es la copia de los archivos del proyecto en tu máquina. Aquí editas, creas o borras archivos. Los cambios aún no forman parte del historial de Git.

- **Staging Area / Index** 
    - *¿que es y para que sirve?* Es una zona intermedia donde se guardan los cambios que quieres incluir en el próximo commit. Te permite seleccionar qué modificaciones se registrarán en el historial. Es como preparar una “caja” con los cambios antes de enviarlos.

- **Repository** 
    - *¿que es y para que sirve?* Es la base de datos interna de Git. Aquí se almacenan los commits confirmados, con todo el historial de versiones, autores y mensajes.

---------------------------------------------------------------------------------------------

**3** 
- **Blob** Un objeto que guarda el contenido exacto de un archivo.
    - No guarda el nombre del archivo ni su ubicación, solo los datos. 

- **Tree** Representa la estructura de directorios.
    - Contiene referencias a blobs y a otros trees y guarda metadatos como el nombre del archivo y los permisos.

- **Commit** Un snapshot del proyecto en un momento dado.
    - Apunta a un objeto tree que representa el estado completo de los archivos e
    incluye metadatos como autor, fecha, mensaje de commit.

- **Tag** Una etiqueta legible que apunta a un commit.
    - - Puede ser ligero (solo un alias) o anotado (con mensaje, firma, fecha),
    Se usa para marcar versiones importantes.

---------------------------------------------------------------------------------------------

**4** *Commit:* Un commit en Git es el corazón del control de versiones: representa una instantánea del proyecto en un momento específico.

- **¿como se crea?**
    - **1** Editas archivos en tu working directory
    - **2** Preparas los cambios con: 
       - *git add "archivo.md"*
    - **3** Confirmas los cambios con:
       - *git commit -m "Mensaje descriptivo de los cambios"*

---------------------------------------------------------------------------------------------

**5** la diferencia entre el **git fetch** y el **git pull** es que el primero descargar los cambios del repositorio remoto pero no los aplica a tu rama local, te permite revisar primero que cambio antes de integrarlo. Por otro lado, el segundo descarga los cambios del repositorio remoto y los integra directamente en tu rama local, es mucho mas rapido pero tienes menos control que el primero.

---------------------------------------------------------------------------------------------

**6** 















