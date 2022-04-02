# Mybatis_Json
●MySql(Docker) + mybatis + Spring boot
- application.javaと同じ場所にcontroller.javaを作る(import rest controller作成) 
- src/main/resourcesの中にapplication.ymlを作成(application.propertiesはdeleteしておく)
- application.ymlのurl(port番号, database名), username(root), passwordを変更, 
- controllerと同じ場所にjavaクラスを作ってO/Rマッパー用のJava(Mapper.java)でのデータを作成 
- controllerと同じ場所にjavaファイル(cars.java)を作る,sqlと同じget, setデータを作成
- .xmlのファイルを入れるディレクトリのパスは気を付ける
- xml fileに
(違うところにxmlを置いてもapplication.ymlにmapper-locations: classpath*(途中までのcom.example.demo):/db(入っている場所)/*.xmlで設定できて繋げる
