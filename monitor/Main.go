package main


import (
	"net/http"
	"time"
)

func monitoring() {
	resp, err := http.Get("http://localhost:8080/ready")
	if (err != nil || resp.StatusCode != 200){
		println("[" + time.Now().Format(time.StampMilli) + "]アカーン！!")
		return
	}
	defer resp.Body.Close()
}

func main() {
	for true {
		time.Sleep(500 * time.Millisecond)
		go func() {
		  monitoring()
		}()
	}
}

