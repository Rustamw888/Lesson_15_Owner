## :rocket: Инструкция запуска тестов через терминал
![This is an image](https://i.imgur.com/cbqojEW.jpeg)
- Веб тесты локально: ./gradlew clean test --tests WebTest -Dstart=webLocal
- Веб тесты удаленно: ./gradlew clean test --tests WebTest -Dstart=webRemote
- Апи тесты локально: ./gradlew clean test --tests ApiTest
- Апи тесты удаленно: ./gradlew clean test --tests ApiTest -DbaseUrl= -Dtoken=
