//引入wangEditor
var E = window.wangEditor;
var editor = new E('#editor');
// 或者 var editor = new E( document.getElementById('editor') )
editor.create();

//图片预览功能,file指文件，imgDom指JS的dom对象("#xxx")[0]，即需要展示的地方
function imgPreview(file,imgDom) {
    //判断浏览器是否支持FileReader
    if(window.FileReader){
        var reader = new FileReader();
    }else{
        alert("您的浏览器不支持图片预览功能，如需此功能请更换谷歌浏览器")
    }
    var imgType = /^image\//;
    //判断上传的文件是否是图片
    if(!imgType.test(file.type)){
        alert("请上传图片");
        return;
    }
    //读取操作完成时触发此事件,e代表了progressEvent即
    reader.onload = function (e) {
        //获取图片路径
        //图片路径设置为读取的图片
        imgDom.src = e.target.result;
    };
    reader.readAsDataURL(file);

}