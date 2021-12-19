const express = require('express')
const querystring = require('querystring')
const pool = require('../qqpoor.js')
const nodegrass = require('nodegrass');
const os = require('os');
const fs = require('fs');
const requestIp = require('request-ip');
 const publicIp = require('public-ip') 
const {
    Console
} = require('console');
let qqrouter = express.Router()

qqrouter.get('/get_data', (req, res) => { //定义模块名字get_mark
    $group = req.query.group; //获取uri参数groupID
    $group1 = $group.replace(/\'/g, "")
    $id = req.query.id; //获取QQid
    if (typeof ($id) == 'undefined') {
        $id = 'data'
        //console.log('sss' + $id)
    }
    console.log('get data: ' + $group1)
    pool.query(`SELECT * FROM ` + $group1 + ` WHERE QQ= '${$id}'`, (err, result) => { //数据库查询，callback返回函数
        console.log('数据库读取结果：')
        console.log(result)
        if (err) {
            console.log('Create group data table: ' + $group)
            pool.query(`CREATE TABLE ${$group1}(QQ  varchar(64),data varchar(5000))`, (err, result) => {
                //console.log('aaa')
                if (err) {
                    res.send({
                        code: -1
                    })
                    return
                }
                //console.log(result)
            })
            //console.log('??' + $id)
            pool.query(`INSERT INTO ${$group1} VALUES('${$id}','')`, (err, result) => {
                if (err) {
                    res.send({
                        code: -1
                    })
                    return
                }

            })
            res.send({
                code: 0,
                qq: $id,
                data: ''
            })
            return
        } else {
            if (result == '') {
                pool.query(`INSERT INTO ${$group1} VALUES(${$id},'')`, (err, result) => {
                    if (err) {
                        res.send({
                            code: -1
                        })
                        return
                    }
                    res.send({
                        code: 0,
                        qq: $id,
                        data: ''
                    })
                })
                return
            }
            result[0].code = 0
            console.log(result)
            console.log(result[0])
            //result[0].data = JSON.stringify(result[0].data)
            //console.log(result[0])
            //res.send(result[0].data)
            res.send(result[0])
        }

    })
})

qqrouter.get('/get_anti_porn', (req, res) => {
    let $imgId = req.query.imgId;
    pool.query(`SELECT * FROM antiPornPicLib  WHERE imgId='${$imgId}'`, (err, result) => {
        if (err) {
            res.send({
                code: -1
            })
            return
        }

        if (result == '') {
            res.send({
                code: 0,
                imgType: -1
            })
            console.log('nan' + result)
            return
        }
        console.log(result[0])
        result[0].count = result[0].count + 1;
        let query = result[0]
        query.code = 0
        pool.query(`UPDATE antiPornPicLib SET count=${result[0].count} WHERE imgId='${$imgId}' `, (err, result) => {
            if (err) {
                res.send({
                    code: -1
                })
                return
            }
            res.send(query)
        })
    })
})
qqrouter.get('/ip',(req,res)=>{
  publicIp.v4().then((ip) => res.send(ip))
    })
qqrouter.get('/set_anti_porn',(req,res)=>{
    let $imgId = req.query.imgId;
    let $imgType = req.query.imgType;
    let $data=req.query.data;
    pool.query(`UPDATE antiPornPicLib SET data='${$data}',imgType=${$imgType} WHERE imgId='${$imgId}' `, (err, result) => {  

   if (err) {
            res.send({ code: -1 })
            return
        };
        res.send({ code: 0 })
})
})
qqrouter.get('/add_anti_porn', (req, res) => {
    let $imgId = req.query.imgId;
    let $imgType = req.query.imgType;
 let $data=req.query.data;
    if(!$imgType){
        $imgType=-1;
    }
    if(!$data){
        $data='[]'
    }
    pool.query(`INSERT INTO antiPornPicLib VALUES ('${$imgId}',${$imgType},0,'${$data}')`, (err, result) => {
        if (err) {
            res.send({
                code: -1
            })
            return
        };
        res.send({
            code: 0
        })

    })

})

qqrouter.get('/set_data', (req, res) => {
    let $group = req.query.group;
    let $id = req.query.id;
    let $data = req.query.data;
    if (!$id) {
        $id = 'data'
    }
    pool.query(`UPDATE ${$group} SET data='${$data}' WHERE QQ='${$id}' `, (err, result) => {
        if (err) {
            res.send({
                code: -1
            })
            return
        }
        res.send({
            code: 0
        })
    })
})

module.exports = qqrouter
