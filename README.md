#目的
以下のものを得たい
・k8sの概要
・k8sのなんとなくの動かし方
・pod間の通信
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
	●Running Kubernetes Locally via Minikube
	https://kubernetes.io/docs/getting-started-guides/minikube/
	●KVMドライバーインストール
	https://github.com/kubernetes/minikube/blob/master/docs/drivers.md#kvm-driver
	https://github.com/dhiltgen/docker-machine-kvm/releases



#DOING
kubenetesを使わずにdockerでCityAPIを動かす
	テスト修正

#TODO
kubenetesを使わずにdockerでCityAPIを動かす
	必要最小限にCityAPIを修正
	CityApiのDockerファイルの作成
	動作確認
minikubeでCityAPIを動かす
	動作確認
デプロイパイプライン作成
