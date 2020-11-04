//服务层
app.service('attachmentIndexService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../attachmentIndex/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../attachmentIndex/findPage.do?pageNum='+page+'&pageSize='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../attachmentIndex/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../attachmentIndex/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../attachmentIndex/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../attachmentIndex/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../attachmentIndex/search.do?pageNum='+page+"&pageSize="+rows, searchEntity);
	}    	
});