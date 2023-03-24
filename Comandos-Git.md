# Git + Consola

## Requisitos

- Cliente consola: https://git-scm.com/
- Repositorio en servidor Git: https://github.com/

---

## Iniciar consola

1. Instalar el cliente Git
2. Abrir la terminal
    1. Para usuarios Windows abrir la terminal llamada `Git Bash`.
    2. Para usuarios Linux/Mac abrir la terminal por defecto.

---

## Comandos de la terminal

- `ls`: Listado de archivos y directorios del directorio actual.
- `cd {nombre-de-directorio}`: Posicionarse en el directorio: `nombre-de-directorio`
- `cd ..`: Posicionarse en el directorio padre. Nota: el espacio en medio es importante.
- `clear`: Limpiar la terminal.
- `mkdir {nombre-de-directorio}`: Crea un directorio con el nombre: `nombre-de-directorio`

---

## Comandos Git

- `git clone {url-repositorio}`: clona en el git local el repositorio. Debe clonarse en un directorio vacío.
- `git status`: Verifica el estado del branch sobre el cual se está posicionado.
- `git fetch`: Actualiza el listado de repositorios remotos.
- `git add {archivo/directorio}`: Agrega los archivos o directorios modificados al stage area. Puede utilizar `git add .` para agregar todos los archivos y sub-directorios de un directorio en
  particular.
- `git commit -m "comentario del request"`: Crea un commit con los archivos que existen en el stage area
- `git checkout {branch}`: Realiza el cambio a otro branch
- `git chechout -b {branch}`: Realiza el cambio a otro branch y en este caso lo crea.
- `git pull origin {branch-remoto}`:  Actualiza el branch local con el `branch-remoto`
- `git push origin {branch-remoto}`: Envía los cambios realizados en el repositorio local hacía el `branch-remoto`
- ` git config --global {propiedad} {valor}`: Utilizado para añadir configuraciones globales:
    - `user.name`
    - `user.email`
    - `alias.{shortcut}`
- `git config --list --show-origin`: Lista la configuración actual

- `git config --global user.name "Leonardo Camacho"`
- `git config --global user.email leocamachocr@gmail.com`

// usa el editor code por defecto y espera hasta que el editor se cierre
`git config --global core.editor "code --wait"` // Esto es opcional
//Abre configuraciones globales
`git config --global -e`

// Para eliminar el crlf en windows usar:
`git config --global core.autocrlf true`: o `input` para mac





## Remover configuraciones locales
git config --global --unset user.name
git config --global --unset user.email
git config --global --unset credential.helper