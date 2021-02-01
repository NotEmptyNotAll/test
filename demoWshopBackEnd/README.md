##Сборка проекта

###Сборка проекта
1) `mvn install:install-file -DgroupId=itd.wshop -DartifactId=wshop-client-lib -Dversion=[version] -Dpackaging=jar -Dfile=[pathFile]`
2) `mvn install`
3) `mvn exec:java`

###настройка ресурсов
после того как вы добавили jar файл к проекту, надо перенести в папку `src/main/resources` .properties и .xml, а именно `profiles.xml`, `app.propertties`. Также поменять в `application.properties` следующие значения:
`project.version`,
`db.name`,
`common.db.name`,
`jndi.application.name`,
`jndi.dataSource`,
`company`,
`VATValue`.

