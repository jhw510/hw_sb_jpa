"use strict"	
var admin = admin || {}
admin = (()=> {
	let init = ()=> {
		alert('어드민1')
		onCreate()
	}
	let onCreate = ()=> {
		alert('어드민2')
		setContentView()
	}
	let	setContentView = () => {
			alert('어드민3')
		
	}
	return {init}
})()