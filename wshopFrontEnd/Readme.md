### Angular CLI
инструмент который вы используете для инициализации, разработки, формирования и поддержки приложений Angular. Для установки используем команду - `npm install -g @angular/cli`

### установить пакеты npm
`npm install`- устанавливаем  пакеты, описанные в package.json

### сборка проекта
`ng build --prod`- компилирует приложение Angular в выходной каталог с именем dist/ cо всеми файлами, которые необходимы службе хостинга для обслуживания вашего приложения.Скопируйте содержимое dist/my-project-nameпапки на свой веб-сервер.  Поскольку эти файлы статичны, вы можете разместить их на любом веб-сервере, способном обслуживать файлы

### запуск проекта
`ng serve`- Создает и обслуживает ваше приложение, восстанавливая его при изменении файлов

### запуск c ssl
`ng serve --ssl`- Создает ваше приложение, и включает сертификат.

### запуск cо своим портом и хостом
`ng serve --port 8080 --host localhost`-  указываем свой порт и хост.

### где менять api для связи с backend
ts файл  расположен `src/app/Service/api-data-service.service.ts`. В этом файде надо поменять значение `mainURL` на свою ссылку в backend

### Изменение локали
Изменить дефолтную локаль можна в файле `src/app/Service/api-data-service.service.ts`  значение параметра `defaultLang`

### настройка https
в корневой папке проекта откройте `angular.json`

`projects.primeng-issue-template.architect.serve.options.ssl`-логическое значение, включает или выключает защищенное соединение. Если мы здесь включили ssl соединение, то запускать можно без `--ssl`

`projects.primeng-issue-template.architect.serve.options.sslKey`-укажите расположение ключа .key

`projects.primeng-issue-template.architect.serve.options.sslCert`-укажите расположение сертификата .crt

### пошаговый запуск

1. `npm install -g @angular/cli`
2. `npm install`
3. `npm serve`
