var express = require('express');
var router = express.Router();

router.get('/index', function(req, res, next) {
    res.render('index')
})

router.get('/raport', function(req, res, next) {
    res.render('raport')
})

router.get('/dataguru', function(req, res, next) {
    res.render('dataguru')
})
router.get('/datasiswa', function(req, res, next) {
    res.render('datasiswa')
})
router.get('/semester', function(req, res, next) {
    res.render('semester')
})
router.get('/mapel', function(req, res, next) {
    res.render('mapel')
})

module.exports = router;