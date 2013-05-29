(ns tr8n.hermes
  (:gen-class))

(defn -main [& args]
  (require '[tr8n.hermes.main])
  (apply (resolve 'tr8n.hermes.main/main) args))
