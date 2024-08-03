const user={
    uemail:"sachinmaurya241@gmail.com",
    upass: 12345678
};
let req=[prompt("Enter your email:" ),prompt("Enter your password:")];
document.write(req[0]);
document.write(req[1]);
document.write(user.uemail);
if(user.uemail===req[0] && user.upass===req[1]) {
    document.write('<h1>Welcome</h1>');
} 