{ "relpath": "."
, "default-jvmargs": "-mx1024 -XX:MaxPermSize=256m" 
, "arglist": 
        [ { "plainarg" : "com.xxx.yyyy.lll.App" } 
        , { "plainarg" : "com.xxx.yyyy.lll.Cpp" , "onlyon" : "linux" } 
        , { "plainarg" : "com.xxx.yyyy.lll.Cpp" , "onlyon" : "windows" } 
        , { "patharg"  : { "prefix":"--conf ", "relpath": "conf/vdp"  } } 
        ]
}
