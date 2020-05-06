  
"use strict"

var admin = admin || {}

admin = (() => {
	const WHEN_ERROR = `호출하는 JS 파일을 찾지 못했습니다.`
		let user_vue
		
	let init = () => {
		user_vue= `/resources/vue/user_vue.js`
		
			onCreate()
	}
	let onCreate = () => {
		$.when(
				$.getScript(user_vue)
				).done(()=>{
		setContentView()
		$.getJSON('/users', d => {
			$('#total_count').text('총회원수  : '+d.length)
			$.each(d, (i, j) => {
						$(`<tr>
                        	<th>
                                <span>${i+1}</span>
                            </th>
                            <th>
                                <span>${j.userid}</span>
                            </th>
                            <th>
                             <span id="user_`+(i+1)+`"></span>
                            </th>
                             <th>
                                <span>${j.ssn}</span>
                            </th>
                           <th>
                                <span>${j.email}</span>
                            </th>
                            <th>
                                <span>${j.phoneNumber}</span>
                            </th>
                            <th>
                                <span>${j.registerDate}</span>
                            </th>
                            
                        </tr>`).appendTo('#userData')
                        
                        $(`<a>${j.name}</a>`)
                        .css({cursor: 'pointer',color: 'blue'})
                        .appendTo("#user_"+(i+1))
                        .click(e => {
                        	e.preventDefault()
                        	$('#userData').empty()
                        	$(userVue.detail()).appendTo('#userData')
                        	$.getJSON(`/users/${j.userid}`,d=>{
                        	$('#userId').text(d.userid)	
                        	$('#userName').text(d.name)	
                        	$('#userSSN').text(d.ssn)	
                        	$('#userAddr').text(d.addr)	
                        	$('#userEmail').text(d.email)	
                        	$('#userPhoneNumber').text(d.phoneNumber)
                        	$('#registerDate').text(d.registerDate)
                        	
                        	})
                        })
			})
		})
		
                        $('#userList')
                        .css({cursor: 'pointer',color: 'blue'})
                        .click(e =>{
                        	e.preventDefault()
                        	location.href = "/admin"
                        })
                         $('#lostChart')
                        .click(e =>{
                        	e.preventDefault()
                        	$('#content').empty()
                        	$('#content').html(`
                        	<div class="box" style="width: 1200px; height: 500px; background: #F78181; overflow-y: scroll;">
                        	<table id="lostData">
                        
                        <tr>
                            <th>
                                <span>No.</span>
                            </th>
                            <th>
                                <span>분실물 ID</span>
                            </th>
                             <th>
                                <span>습득물품명</span>
                            </th>
                           <th>
                                <span>습득일자</span>
                            </th>
                            <th>
                                <span>습득물분류</span>
                            </th>
                            <th>
                                <span>습득위치(지하철)</span>
                            </th>
                        </tr>
                        
                    </table>
                    </div>`)
                    $.getJSON(`/losts`, d=>{
                    	$.each(d,(i,j)=>{
                    		
                    		$(`	<tr>
                        	<td>
                                <span>${i+1}</span>
                            </td>
                            <td>
                                <span>${j.lostId}</span>
                            </td>
                            
                             <td>
                                <span>${j.lostName}</span>
                            </td>
                           <td>
                                <span>${j.lostKind}</span>
                            </td>
                            <td>
                                <span>${j.lostAddr}</span>
                            </td>
                            <td>
                                <span>${j.lostDate}</span>
                            </td>
                            
                        </tr>`).appendTo('#lostData')
                    	})
                    })
                     
			})
				}).fail(()=>{
					alert(WHEN_ERROR)
	
				})		
	}
				
	let setContentView = () => {
		$('#userData tr').first().css({'background-color':'#6799FF'})
		}
		return {init}

	})()