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

**5-** la diferencia entre el **git fetch** y el **git pull** es que el primero descargar los cambios del repositorio remoto pero no los aplica a tu rama local, te permite revisar primero que cambio antes de integrarlo. Por otro lado, el segundo descarga los cambios del repositorio remoto y los integra directamente en tu rama local, es mucho mas rapido pero tienes menos control que el primero.

---------------------------------------------------------------------------------------------

**6** 
- **branch** Es una línea de desarrollo independiente que apunta a un commit específico dentro del historial. Es como un marcador que indica “a partir de aquí quiero trabajar en paralelo”.

- **¿Cómo gestiona Git los punteros a commits?** 
    - **HEAD** apunta al commit actual en el que estás trabajando.
    - *Nombre de la rama* (main) apunta al último commit de esa rama.
- *Cuando haces un commit en una rama:*
    - Git crea un nuevo objeto commit con su propio hash.
    - La rama se actualiza para apuntar a ese nuevo commit.
    - HEAD se mueve junto con la rama activa.

---------------------------------------------------------------------------------------------

**7-** *Como se realiza un merge* 
- **1** Te posicionas en la rama donde quieres integrar los cambios:
    - *git checkout main*
- **2** Ejecutas el merge:
    - *git merge feature*

- **Conflictos que pueden surgir**
    - Misma línea modificada
    - Archivo eliminado o modificado
    - Cambios en estructura de archivos

- **Cómo resolver conflictos**
    - **1** Detectar el conflicto
    - **2** Editar manualmente
       - Decide qué versión conservar (o combina ambas).
       - Elimina los marcadores <<, ==, >>.
    - **3** Marcar como resuelto
       - *git add archivo_conflictivo*
    - **4** Finalizar el merge 
       - *git commit* 

---------------------------------------------------------------------------------------------

**8-** **Cómo funciona el área de staging** Cuando editas archivos, los cambios quedan en el directorio de trabajo, al ejecutar **git add "archivo.txt"**, ese archivo para al staging area, que es como un borrador de tu proximo **commit** alli seleccionas exactamente que cambios quieres incluir. 

**¿Que pasa si omito el git add?** Si corres git *commit* sin haber hecho *git add*, no se incluirán tus cambios y tus modificaciones seguirán en el directorio de trabajo, pero no quedarán registradas en el historial.

---------------------------------------------------------------------------------------------

**9** **.Gitignore** es un archivo de configuración que se coloca en la raíz de un repositorio Git para indicar qué archivos o directorios deben ser ignorados por el sistema de control de versiones. Esto significa que Git no los incluirá en el seguimiento de cambios ni en las confirmaciones. 

**Cómo influye en el seguimiento de archivos**
- Git clasifica los archivos en 3 categorias:
    - *Con seguimiento*: Archivos que ya han sido añadidos al repositorio y forman parte del historial.
    - *Sin seguimiento*: - Archivos presentes en el directorio de trabajo pero que aún no se han agregado con **git add**
    - *Ignorados*:- Archivos que se especifican en **.gitignore** para que Git los ignore por completo.

---------------------------------------------------------------------------------------------

**10** La diferencia entre un **commit--amend** y un nuevo commit, es que el primero lo que hace es modificar y reemplazar el commit anterior, por otro lado, el nuevo commit si crea otro commit adicional manteniendo el historial intacto y agregando un nuevo nodo. Cabe aclarar que si ya realizaste un **push** a un repositorio compartido, puede complicar la colaboración, porque reescribe el historial y obliga a otros a sincronizar con un historial diferente, por eso en esos casos es mejor realizar un nuevo commit.

---------------------------------------------------------------------------------------------

**11** **Git stash**: Sirve para guardar temporalmente los cambios no confirmados (tanto los que están en staging como los que no) en una especie de “pila” llamada stash. Esto te permite limpiar tu directorio de trabajo y cambiar de rama o atender otra tarea sin necesidad de hacer un commit incompleto. Más tarde, puedes recuperar esos cambios y aplicarlos de nuevo.

- **Como se utiliza el Git stash** 
- *Guardar cambios actuales* 
    - **Git stash** > Guarda todos los cambios pendientes y deja el directorio limpio.
- *Listar los stashes guardados* 
    - **Git stash list** > Muestra la pila de stashes con identificadores como **stash@{0}**.
- *Aplicar un stash* 
    - **Git stash apply stash@{0}** > Recupera los cambios guardados en ese stash específico (no lo elimina de la pila) 
- *Aplicar y eliminar al mismo tiempo*
    - **Git stash pop** > Aplica el ultimo stash y lo quita de la lista. 

---------------------------------------------------------------------------------------------

**12** **Comandos para deshacer cambios**
- **Git reset** Mueve el puntero HEAD a un commit anterior y ajusta el área de staging y/o el directorio de trabajo según la opción usada. 
    - *Uso típico*: Deshacer commits recientes o volver a un estado anterior en tu rama local.
- **Git revert** Crea un nuevo commit que revierte los cambios introducidos por un commit específico.
    - *Uso típico*: Deshacer cambios en un repositorio compartido, porque es seguro y no rompe el historial que otros ya tienen.
- **Git checkout** - Cambia de rama **git checkout nombre-rama**
    - *- Uso típico*: Cambiar de contexto entre ramas o descartar modificaciones locales en archivos específicos.

---------------------------------------------------------------------------------------------

**13** **Origin** > Es el remoto que apunta a tu fork (tu copia del repositorio en tu cuenta), se crea automáticamente cuando clonas tu fork.

- **upstream** > Es el remoto que apunta al repositorio original del que hiciste el fork,
lo configuras manualmente para poder sincronizar tu fork con el proyecto principal.

#### Gestion de forks
- *Clonar tu fork*
    - **git clone https://github.com/TU-USUARIO/TU-FORK.git**
      **cd TU-FORK**
- *Agregar el remoto upstream*
    - **git remote add upstream https://github.com/ORIGINAL-OWNER/REPO.git**
- *Verificar remotos configurados*
    - **git remote -v**
- *Mantener tu fork sincronizado*
    - **git fetch upstream**
      **git checkout main**
      **git merge upstream/main**

---------------------------------------------------------------------------------------------

**14** **Git log**
- *Función*: Muestra el historial de commits en orden cronológico inverso (del más reciente  al más antiguo).
- *Información que despliega*:
    - Hash del commit (identificador único).
    - Autor y fecha.
    - Mensaje del commit.

- **Git diff**
- *Funcion*:Muestra las diferencias entre dos estados del repositorio.
- *Usos comunes*
    - **git diff** > cambios en el directorio de trabajo respecto al último commit.
    - **git diff --staged** > cambios que ya están en staging respecto al último commit.
    - **git diff commit1 commit2** > diferencias entre dos commits específicos.

- **Git show**
- *Funcion*: Muestra información detallada de un commit específico.
- *Incluye*:
    - Metadatos (autor, fecha, mensaje).
    - Diferencias introducidas por ese commit

---------------------------------------------------------------------------------------------














































