//服务层
app.service('cashLogService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../cashLog/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../cashLog/findPage.do?pageNum='+page+'&pageSize='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../cashLog/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../cashLog/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../cashLog/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../cashLog/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../cashLog/search.do?pageNum='+page+"&pageSize="+rows, searchEntity);
	}    	
});