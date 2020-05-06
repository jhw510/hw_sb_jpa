  
"use strict"
var lost = lost || {}
lost = (()=>{
	const WHEN_ERROR = `호출하는 JS 파일을 찾지 못했습니다.`
	let lost_vue
	let init = () => {
		lost_vue = `/resources/vue/lost_vue.js`
		onCreate()
	}
	let onCreate = () =>{
		$.when(
			$.getScript(lost_vue)
		).done(()=>{
			setContentView()
			$('#lostChart').click(e=>{
		     	$('#content').empty()
		     	$('#content').html(lostVue.lost())
		     	setContentView()
				$.getJSON('/losts', d => {
					$('#total_count').text('총회원수  : '+d.length)
					$.each(d, (i, j) => {
						$(`<div class="box" style="width: 1200px; height: 500px; background: #F78181; overflow-y: scroll;">
						<tr>
		                        	<td>
		                                <span>${i+1}</span>
		                            </td>
		                            <td>
		                                <span>${j.lostId}</span>
		                            </td>
		                            <td>
		                             <span id="lostId_`+(i+1)+`"></span>
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
		                            
		                        </tr>
		                        </div>`).appendTo('#lostListData')
		                        
		                      
		                        $('#userList')
		                        .click(e =>{
		                        	e.preventDefault()
		                        	location.href = "/admin"
		                        })
					}) // each
				}) // getJSON
						}).fail(()=>{
							alert(WHEN_ERROR)
						})
						}
			let setContentView = () => {
				$('#lostListData tr').first().css({'background-color':'#6799FF'})
				}
				return {init}
				
			})()