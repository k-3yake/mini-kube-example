#目的
以下のものを得たい
・k8sの概要
・k8sのなんとなくの動かし方
・service間の通信
・serviceへの外部からの接続
・k8sでのCD方法

#手段
ローカルでminikubeを使用して動くAPIを作成する。
構成は以下
・CityAPI
　ローカルから接続出来ること
　Service内のDBのPodに接続出来ること

#手順
minikubeのローカルへのインストール
	●install minikube
	https://kubernetes.io/docs/tasks/tools/install-minikube/
	●kvs install
	sudo apt-get install qemu-kvm libvirt-bin virtinst bridge-utils cpu-checker
	BIOSからVM系を有効に
	●KVMドライバーインストール
	https://github.com/kubernetes/minikube/blob/master/docs/drivers.md#kvm-driver
	https://github.com/dhiltgen/docker-machine-kvm/releases
	●Running Kubernetes Locally via Minikube
   	https://kubernetes.io/docs/getting-started-guides/minikube/
   	●dashbord
   	minikube dashboard --url

デプロイ
   	●kompose
   	https://kubernetes.io/docs/tools/kompose/user-guide/
   	kubectl create -f city-api-service.yaml,db-service.yaml,city-api-deployment.yaml,db-deployment.yaml,db-claim0-persistentvolumeclaim.yaml
   	●nodePortを指定
   	https://qiita.com/suzukihi724/items/5e16855c3941e629ff70
    ●プライベートリポジトリの使用
    https://blog.hasura.io/sharing-a-local-registry-for-minikube-37c7240d0615

Service間の通信の設定
    ※komposeはnetworksに対応していない

#動作確認
curl -X POST -H "Content-Type: application/json" -d '{"name":"ebisu", "country":"Japan"}' http://localhost:8080/city 

#DOING
Rediness Probの検証
  monitorの実行可能ファイルを作成
  Probの作成

#TODO
RollingUpdateのデモ
redis-clusterとstatefulSet
ローカルでの開発の仕組みの検討
  ideからk8sのDBにつなぐ
redisを使用したk8sの検討
  並列化はどうするか？
  バックアップはどうするか?
  書き込みの共有はどうするか？
      
デプロイパイプライン作成
