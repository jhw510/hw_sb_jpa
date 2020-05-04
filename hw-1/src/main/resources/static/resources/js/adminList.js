"use strict"

var adminList = adminList || {}	
adminList =(()=> {
	let init = ()=>{
		onCreate()
	}
	let onCreate = ()=>{
		setCotentView()
		$.getJSON('/admins' , d =>{
			$('#total_count').text('총 관리자 수 :' + d.length)	
			$.each(d , (i,j)=>{
				$(`<tr>
                    	<td>
                            <span>${i+1}</span>
                        </td>
                        <td>
                            <span>${j.userid}</span>
                        </td>
                        <td>
                         <span id="user_`+(i+1)+`"></span>
                        </td>
                         <td>
                            <span>${j.ssn}</span>
                        </td>
                       <td>
                            <span>${j.email}</span>
                        </td>
                        <td>
                            <span>${j.phoneNumber}</span>
                        </td>
                        <td>
                            <span>${j.registerDate}</span>
                        </td>
                        
                    </tr>`).appendTo('#userData')
                     $(`<a>${j.name}</a>`)
                        .css({cursor: 'pointer',color: 'blue'})
                        .appendTo("#user_"+(i+1))
                        .click(e => {
                        	alert(`${j.userid}`)
                        })
			})
			
		})
	}
	let setContentView = () => {
		$('#userData tr').first().css({'background-color':'#6799FF'})
		
		
		}
		return {init}
})()