/**
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
    Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Sample input: 07:05:45PM
Sample output: 19:05:45

Sample input: 06:40:03AM
Sample output: 06:40:03

Sample input 12:45:54PM
Sample output 12:45:54

Sample input 12:40:22AM
Sample output 00:40:22
 */


function timeConversion(s){
    const twelveAM = '12:00:00AM';
    const twelvePM = '12:00:00PM'
    const getHour = (s.slice(0,2) * 1);
    const getMinute  = s.slice(3,5);
    const getSeconds = s.slice(s.length-2);
    const getMeridiem = s.charAt(s.length-2);
    const removeMeridiem = s.substring(0, s.length-2);
    const convertValBy = 12;
    const timeConverter = (getHour + convertValBy).toString();

    if(s === twelveAM) return '00:00:00';
    if(s === twelvePM) return '12:00:00';
    // handle afternoon/evening/night time i.e PM
    // 07:05:45PM = 19:05:45
    if(getHour < 12 && getMeridiem == 'P') return removeMeridiem.replace(s.slice(0,2), timeConverter);
    // 12:45:54PM = 12:45:54
    if(getHour == 12 && getMinute > 0 && getMeridiem == 'P') return removeMeridiem;

    // handle morning time i.e AM
    // 06:40:03AM = 06:40:03
    if(getHour < 12 && getMeridiem == 'A') return removeMeridiem;
    if(getHour == 12 && getMeridiem == 'A'){
        if(getMinute > 0 || getSeconds > 0){
        return removeMeridiem.replace(getHour, '00');
        }
    }
}

console.log(timeConversion('07:05:45PM'));

// const str = '07:05:45PM';
// const getHour = str.slice(0,2)*1;
// const removeM = str.substring(0, str.length-2);
// console.log(removeM);