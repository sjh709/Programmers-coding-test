function solution(id_list, report, k) {
    let answer = new Array(id_list.length).fill(0);
    let report_list = {};
    
    id_list.map((id) => {
        return report_list[id] = [];
    });
    
    report.forEach((user) => {
        let [user_id, repo_id] = user.split(' ');
        if(!report_list[repo_id].includes(user_id)) {
            report_list[repo_id].push(user_id);
        }
    });
    
    for(let key in report_list) {
        if(report_list[key].length >= k) {
            report_list[key].map((id) => {
                answer[id_list.indexOf(id)]++;
            });
        }
    }
    
    return answer;
}
