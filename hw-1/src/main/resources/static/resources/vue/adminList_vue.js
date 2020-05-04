"use strict"

const adminListVue = {
		list : ()	->{
			return 
			`<tr>
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
        
    </tr>`
		}
}