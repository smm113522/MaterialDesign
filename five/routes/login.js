/**
 * Created by Administrator on 2017/1/26.
 */
var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
    res.render('login', { title: 'Expresslogin' });
});

module.exports = router;
