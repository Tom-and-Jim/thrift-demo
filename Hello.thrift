namespace java com.example.gen

struct People {
    1:string name
    2:i32 age
}

service HelloService {
    People hello(1:string name, 2:i32 age)
}