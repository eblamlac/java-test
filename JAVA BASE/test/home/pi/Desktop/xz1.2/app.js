const express=require('express');
const bodyParser=require('body-parser')
const userRouter=require('./routers/user.js')
const com=require('./routers/com.js')
const productRouter=require('./routers/product.js')
let app=express();
app.listen(8080);
//托管静态资源public
app.use( express.static('public') )
//使用中间件
app.use(bodyParser.urlencoded({
exyened:false  //不适用扩展的qs模块而是使用querystring解析为对象
}))
//用户路由挂在到服务器下，添加前缀 /user
// /user /user_register
app.use('/user',userRouter);
app.use('/product',productRouter)
app.use('',com)






















































