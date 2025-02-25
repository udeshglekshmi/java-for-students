/*
* Conditional statement 
*/ 

let job_position: string = "senior";  
let jobSalary: number = 20000; 
let isEligible: boolean = true;  

if((job_position === "junior" || job_position==="fresher") && (jobSalary >= 20000 && jobSalary <= 25000)) { 

	//console.log(b1 + " job salary " + jobSalary); 
	console.log(`${isEligible} - Job Salary:${jobSalary}`);
}
else if((job_position === "senior") && (jobSalary >= 20000 && jobSalary <= 25000)) { 

		jobSalary += 4000 ; // (+=) Short hand operator 
 
     //console.log(b1 + " job salary " + jobSalary);
		console.log(`${isEligible} - Job Salary ${jobSalary}`); 
} 
else { 
console.log(false); 
}
console.log("--Exit--"); 